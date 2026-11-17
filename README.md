# KDE Connect - Android app

KDE Connect is a multi-platform app that allows your devices to communicate (eg: your phone and your computer).

## (Some) Features
- **Shared clipboard**: copy and paste between your phone and your computer (or any other device).
- **Notification sync**: Read and reply to your Android notifications from the desktop.
- **Share files and URLs** instantly from one device to another.
- **Multimedia remote control**: Use your phone as a remote for Linux media players.
- **Virtual touchpad**: Use your phone screen as your computer's touchpad and keyboard.

All this without wires, over the already existing Wi-Fi network, and using TLS encryption.

## About this fork

Synced with upstream `KDE/kdeconnect-android` master and maintained separately. Includes:

- **Upstream sync**: 5 years of KDE changes merged (features, bug fixes, translations).
- **Scoped storage fixes**: On Android 11+, received files save to the app's external files directory and are auto-copied to `Download/kde_connect/` for Gallery visibility.

## How to install this app

Download the latest build from the [Releases](https://github.com/EggY0lk/kdeconnect-android/releases) page and install it either way:

**Via ADB** (phone must be connected with USB debugging enabled):

```
adb install kdeconnect-android-debug.apk
```

**Directly on your phone:**

Download the `.apk` file directly to your phone and open it to install.

## Credits

**Original app:** KDE Connect is developed by the KDE community. Original Android port by Albert Vaca Cintora and contributors. Source: https://invent.kde.org/network/kdeconnect-android/

**Fork fixes:** Scoped storage file receive fix and auto-copy to `Download/kde_connect/` implemented directly with Hermes Agent (Nous Research), powered by **nvidia/nemotron-3.5-super-vl-120b-a12b** (provider: NVIDIA).

**Methodology:** The poteto-mode workflow and deterministic-guardrails-over-prose approach are based on Lauren Tan (poteto)'s "All Code Is Slop (Except Mine)" talk at SpaceXSI. Credit to Lauren Tan for poteto-mode. Official skill: https://github.com/cursor/plugins/blob/main/pstack/skills/poteto-mode/SKILL.md

## License
[GNU GPL v2](https://www.gnu.org/licenses/gpl-2.0.html) and [GNU GPL v3](https://www.gnu.org/licenses/gpl-3.0.html)

If you are reading this from GitHub, you should know that this is a fork of the [KDE Project repo](https://invent.kde.org/network/kdeconnect-android/) with scoped storage fixes applied.

