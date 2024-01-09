package com.github.yuuki14202028.patches.example.hook.patch.recommendation

import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import com.github.yuuki14202028.patches.example.hook.json.JsonHookPatch
import com.github.yuuki14202028.patches.example.hook.patch.BaseHookPatchPatch

@Patch(
    name = "Hide recommended users",
    dependencies = [JsonHookPatch::class],
    compatiblePackages = [CompatiblePackage("com.twitter.android")]
)
@Suppress("unused")
object HideRecommendedUsersPatch : BaseHookPatchPatch(
    "Lapp/revanced/twitter/patches/hook/patch/recommendation/RecommendedUsersHook;"
)