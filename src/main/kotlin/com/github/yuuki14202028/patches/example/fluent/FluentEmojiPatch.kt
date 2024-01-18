package com.github.yuuki14202028.patches.example.fluent

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import java.nio.file.Files
import java.nio.file.Paths

@Patch(
    name = "Fluent Emoji",
    description = "Replaces the default Twemoji with the fluent emoji",
    compatiblePackages = [CompatiblePackage("com.twitter.android")]
)
@Suppress("unused")
object FluentEmojiPatch : ResourcePatch() {
    override fun execute(context: ResourceContext) {
        val fontDirectory = context["res/font"]
        javaClass.getResourceAsStream("ロゴたいぷゴシック.otf")?.let { inputStream ->
            Files.write(Paths.get(fontDirectory.path, "chirp_regular_400.otf"), inputStream.readAllBytes())
        }


    }
}
