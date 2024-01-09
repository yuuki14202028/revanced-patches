package com.github.yuuki14202028.patches.example.hook.json.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

internal object LoganSquareFingerprint : MethodFingerprint(
    customFingerprint = { methodDef, _ -> methodDef.definingClass.endsWith("LoganSquare;") }
)