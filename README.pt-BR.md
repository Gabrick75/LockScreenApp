# 🔒 Lock Screen Widget

<p align="center">
  <img src="docs/images/screenshot_app.png" alt="Screenshot do App" width="300"/>
</p>

<p align="center">
  <a href="#-funcionalidades">Funcionalidades</a> •
  <a href="#-download">Download</a> •
  <a href="#-instalação">Instalação</a> •
  <a href="#-como-usar">Como Usar</a> •
  <a href="#-tecnologias">Tecnologias</a> •
  <a href="#-contribuindo">Contribuindo</a> •
  <a href="#-licença">Licença</a>
</p>

<p align="center">
  <a href="README.md">🇺🇸 English</a>
</p>

---

## 📖 Sobre

**Lock Screen Widget** é um aplicativo Android simples e elegante que permite bloquear a tela do seu dispositivo com apenas um toque em um widget na tela inicial.

Desenvolvido com **Material You**, o app adapta automaticamente suas cores para combinar com seu papel de parede no Android 12 e superior.

---

## ✨ Funcionalidades

- 🔒 **Bloqueio com um toque** - Bloqueie sua tela instantaneamente da tela inicial
- 🎨 **Suporte ao Material You** - Cores dinâmicas baseadas no seu papel de parede (Android 12+)
- 🌙 **Tema Claro/Escuro** - Segue automaticamente o tema do sistema
- 📱 **Leve** - Uso mínimo de bateria e armazenamento
- 🚀 **Fácil configuração** - Processo de ativação simples
- 🆓 **Gratuito e Open Source** - Sem anúncios, sem rastreamento

---

## 📥 Download

### Última Versão

[![GitHub release](https://img.shields.io/github/v/release/Gabrick75/LockScreenApp?style=for-the-badge)](https://github.com/Gabrick75/LockScreenApp/releases/latest)

[⬇️ Baixar APK](https://github.com/Gabrick75/LockScreenApp/releases/latest)

---

## 📲 Instalação

### Via APK

1. Baixe o APK mais recente em [Releases](https://github.com/Gabrick75/LockScreenApp/releases)
2. Ative "Instalar de fontes desconhecidas" se solicitado
3. Instale o APK
4. Abra o app e siga as instruções de configuração

### Via Código Fonte

```bash
# Clone o repositório
git clone https://github.com/Gabrick75/LockScreenApp.git

# Abra no Android Studio
# Compile e execute no seu dispositivo
```

---

## 🚀 Como Usar

### Passo 1: Ativar Administrador do Dispositivo

1. Abra o app **Lock Screen Widget**
2. Toque em **"Ativar Administrador"**
3. Confirme a ativação

<p align="center">
  <img src="docs/images/screenshot_app.png" alt="Tela de Ativação" width="250"/>
</p>

### Passo 2: Adicionar o Widget

1. Vá para sua **tela inicial**
2. **Pressione e segure** em uma área vazia
3. Selecione **"Widgets"**
4. Encontre **"Lock Screen Widget"**
5. Arraste para sua tela inicial

### Passo 3: Bloquear a Tela

Simplesmente **toque no widget** para bloquear sua tela instantaneamente! 🔒

---

## 🛠️ Tecnologias

| Tecnologia | Propósito |
|------------|-----------|
| **Kotlin** | Linguagem de programação |
| **Android SDK** | Desenvolvimento Android nativo |
| **Material Design 3** | Componentes de UI modernos |
| **Material You** | Tema dinâmico (Android 12+) |
| **Device Admin API** | Funcionalidade de bloqueio de tela |

---

## 📋 Requisitos

| Requisito | Mínimo |
|-----------|--------|
| **Versão Android** | 7.0 (API 24) |
| **Material You** | Android 12+ (API 31) |

---

## 📁 Estrutura do Projeto

    app/
    ├── src/main/
    │   ├── java/com/lockscreen/app/
    │   │   ├── MainActivity.kt
    │   │   ├── LockScreenWidget.kt
    │   │   └── MyDeviceAdminReceiver.kt
    │   ├── res/
    │   │   ├── layout/
    │   │   ├── drawable/
    │   │   ├── values/
    │   │   └── xml/
    │   └── AndroidManifest.xml
    └── build.gradle.kts

---

## 🤝 Contribuindo

Contribuições são bem-vindas! Veja como você pode ajudar:

1. Faça um **Fork** do repositório
2. **Crie** uma branch de feature (`git checkout -b feature/NovaFuncionalidade`)
3. **Commit** suas mudanças (`git commit -m 'Adiciona NovaFuncionalidade'`)
4. **Push** para a branch (`git push origin feature/NovaFuncionalidade`)
5. **Abra** um Pull Request

### Ideias para Contribuição

- [ ] Adicionar opções de personalização do widget
- [ ] Adicionar múltiplos tamanhos de widget
- [ ] Traduzir para mais idiomas

---

## 🐛 Problemas Conhecidos

| Problema | Motivo | Solução |
|----------|--------|---------|
| Mensagem "Dispositivo bloqueado por política de trabalho" | Limitação da API Device Admin | Nenhuma (limitação do Android) |
| Digital desativada após bloqueio | Limitação da API Device Admin | Use PIN/Senha |

> **Nota:** Essas limitações são devido à API Device Admin do Android. Uma atualização futura pode incluir a opção de Accessibility Service que permite desbloqueio por biometria.

---

## 📄 Licença

Este projeto está licenciado sob a **Licença MIT** - veja o arquivo [LICENSE](LICENSE) para detalhes.

---

## 👤 Autor

**Seu Nome**

- GitHub: [@Gabrick75](https://github.com/Gabrick75)

---

## ⭐ Mostre seu Apoio

Deixe uma ⭐ se este projeto te ajudou!

---

<p align="center">
  Feito com ❤️ para Android
</p>