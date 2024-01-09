package com.github.yuuki14202028.patches.example.hook.patch.ads

import com.github.yuuki14202028.patches.example.hook.json.JsonHookPatch
import com.github.yuuki14202028.patches.example.hook.patch.BaseHookPatchPatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch

@Patch(
    name = "Hide ads",
    description = "Hides ads.",
    dependencies = [JsonHookPatch::class],
    compatiblePackages = [CompatiblePackage("com.twitter.android")]
)
@Suppress("unused")
object HideAdsPatch : BaseHookPatchPatch("Lapp/revanced/twitter/patches/hook/patch/ads/AdsHook;")