package com.lockscreen.app

import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var devicePolicyManager: DevicePolicyManager
    private lateinit var componentName: ComponentName
    private lateinit var tvStatus: TextView
    private lateinit var btnActivate: Button
    private lateinit var btnGithub: LinearLayout

    private val adminLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {
        updateUI()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        devicePolicyManager = getSystemService(Context.DEVICE_POLICY_SERVICE)
                as DevicePolicyManager
        componentName = ComponentName(this, MyDeviceAdminReceiver::class.java)

        tvStatus = findViewById(R.id.tv_status)
        btnActivate = findViewById(R.id.btn_activate)
        btnGithub = findViewById(R.id.btn_github)

        btnActivate.setOnClickListener {
            if (devicePolicyManager.isAdminActive(componentName)) {
                devicePolicyManager.removeActiveAdmin(componentName)
                updateUI()
            } else {
                val intent = Intent(DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN).apply {
                    putExtra(DevicePolicyManager.EXTRA_DEVICE_ADMIN, componentName)
                    putExtra(
                        DevicePolicyManager.EXTRA_ADD_EXPLANATION,
                        "Necessário para bloquear a tela pelo widget"
                    )
                }
                adminLauncher.launch(intent)
            }
        }

        // Clique GitHub
        btnGithub.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("https://github.com/Gabrick75/LockScreenApp")
            }
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        updateUI()
    }

    private fun updateUI() {
        val isActive = devicePolicyManager.isAdminActive(componentName)
        tvStatus.text = if (isActive) "Status: ✅ Ativo" else "Status: ❌ Inativo"
        btnActivate.text = if (isActive) "Desativar Administrador" else "Ativar Administrador"
    }
}