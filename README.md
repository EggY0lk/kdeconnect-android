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

This fork includes fixes for Android 11+ scoped storage:

- **File receive fix**: On Android 11+, scoped storage blocks direct file access to public shared directories. Received files now save to the app's external files directory instead of failing.
- **Auto-copy to public Downloads**: Received files are automatically copied to `Download/kde_connect/` so they appear in Gallery, Photos, and your file manager immediately.

This fork is maintained separately from the upstream KDE project.

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

## License
[GNU GPL v2](https://www.gnu.org/licenses/gpl-2.0.html) and [GNU GPL v3](https://www.gnu.org/licenses/gpl-3.0.html)

If you are reading this from GitHub, you should know that this is a fork of the [KDE Project repo](https://invent.kde.org/network/kdeconnect-android/) with scoped storage fixes applied.

