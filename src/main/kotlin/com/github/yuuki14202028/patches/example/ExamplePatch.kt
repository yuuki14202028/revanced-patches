package com.github.yuuki14202028.patches.example

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch

@Patch(
    name = "最強のPatch",
    description = "This is an example patch to start with.",
    compatiblePackages = [CompatiblePackage("com.twitter.android")]
)
@Suppress("unused")
object ExamplePatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        // TODO("Not yet implemented")
    }
}
