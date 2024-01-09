package com.github.yuuki14202028.patches.example.hook.json.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

internal object JsonInputStreamFingerprint : MethodFingerprint(
    customFingerprint = { methodDef, _ ->
        if (methodDef.parameterTypes.size == 0) false
        else methodDef.parameterTypes.first() == "Ljava/io/InputStream;"
    }
)