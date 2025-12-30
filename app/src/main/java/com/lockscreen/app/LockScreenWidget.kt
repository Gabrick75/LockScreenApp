package com.lockscreen.app

import android.app.PendingIntent
import android.app.admin.DevicePolicyManager
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.widget.RemoteViews
import android.widget.Toast

class LockScreenWidget : AppWidgetProvider() {

    companion object {
        const val ACTION_LOCK_SCREEN = "com.lockscreen.app.LOCK_SCREEN"
    }

    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        for (appWidgetId in appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId)
        }
    }

    override fun onReceive(context: Context, intent: Intent) {
        super.onReceive(context, intent)

        if (intent.action == ACTION_LOCK_SCREEN) {
            lockScreen(context)
        }
    }

    private fun updateAppWidget(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetId: Int
    ) {
        val views = RemoteViews(context.packageName, R.layout.widget_layout)

        val lockIntent = Intent(context, LockScreenWidget::class.java).apply {
            action = ACTION_LOCK_SCREEN
        }

        val pendingIntent = PendingIntent.getBroadcast(
            context,
            0,
            lockIntent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        views.setOnClickPendingIntent(R.id.btn_lock, pendingIntent)

        appWidgetManager.updateAppWidget(appWidgetId, views)
    }

    private fun lockScreen(context: Context) {
        val devicePolicyManager = context.getSystemService(Context.DEVICE_POLICY_SERVICE)
                as DevicePolicyManager

        val componentName = ComponentName(context, MyDeviceAdminReceiver::class.java)

        if (devicePolicyManager.isAdminActive(componentName)) {
            devicePolicyManager.lockNow()
        } else {
            Toast.makeText(
                context,
                "Ative o administrador no app primeiro!",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}