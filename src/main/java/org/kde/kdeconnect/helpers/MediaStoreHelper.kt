/*
 * SPDX-FileCopyrightText: 2023 Albert Vaca Cintora <albertvaka@gmail.com>
 *
 * SPDX-License-Identifier: GPL-2.0-only OR GPL-3.0-only OR LicenseRef-KDE-Accepted-GPL
 */
package org.kde.kdeconnect.helpers

import android.content.Context
import android.content.Intent
import android.media.MediaScannerConnection
import android.net.Uri
import android.util.Log

object MediaStoreHelper {
    /** Broadcasts a scan request for a content:// URI (fallback when no file path is available). */
    fun indexFile(context: Context, path: Uri?) {
        if (path == null) return
        val mediaScanIntent = Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE)
        mediaScanIntent.setData(path)
        context.sendBroadcast(mediaScanIntent)
    }

    /** Asks the system media scanner to index a file by absolute path so Gallery detects it immediately. */
    fun scanFile(context: Context, filePath: String?, mimeType: String?) {
        if (filePath.isNullOrBlank()) return
        MediaScannerConnection.scanFile(context, arrayOf(filePath), arrayOf(mimeType)) { scannedPath, uri ->
            Log.i("MediaStoreHelper", "MediaScannerConnection scanned $scannedPath -> $uri")
        }
    }
}
