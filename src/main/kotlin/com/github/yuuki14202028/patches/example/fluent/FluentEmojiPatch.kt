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
        println("aaaaaaaaaaaaa")
        javaClass.getResourceAsStream("ロゴたいぷゴシック.otf")?.let { inputStream ->
            println("bbbbbbbbbbbbbbbbbbbbbbbb")
            Files.write(Paths.get(fontDirectory.path, "chirp_light_300.otf"), inputStream.readAllBytes())
            Files.write(Paths.get(fontDirectory.path, "chirp_regular_400.otf"), inputStream.readAllBytes())
            Files.write(Paths.get(fontDirectory.path, "chirp_medium_500.otf"), inputStream.readAllBytes())
        }


    }
}
