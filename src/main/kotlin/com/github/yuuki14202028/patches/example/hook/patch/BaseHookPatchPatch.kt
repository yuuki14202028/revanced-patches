package com.github.yuuki14202028.patches.example.hook.patch

import app.revanced.patcher.data.BytecodeContext
import app.revanced.patcher.patch.BytecodePatch
import com.github.yuuki14202028.patches.example.hook.json.JsonHookPatch

abstract class BaseHookPatchPatch(private val hookClassDescriptor: String) : BytecodePatch() {
    override fun execute(context: BytecodeContext) =
        JsonHookPatch.hooks.addHook(JsonHookPatch.Hook(context, hookClassDescriptor))
}