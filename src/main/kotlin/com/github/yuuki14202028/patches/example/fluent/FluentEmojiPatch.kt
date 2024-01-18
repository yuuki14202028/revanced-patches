package com.github.yuuki14202028.patches.example.fluent

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.PatchException
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import java.nio.file.Files
import java.nio.file.Paths

private val classLoader = object {}.javaClass.classLoader


@Patch(
    name = "Fluent Emoji",
    description = "Replaces the default Twemoji with the fluent emoji",
    compatiblePackages = [CompatiblePackage("com.twitter.android")]
)
@Suppress("unused")
object FluentEmojiPatch : ResourcePatch() {
    override fun execute(context: ResourceContext) {
        val fontDirectory = context["res/font"]
        classLoader.getResourceAsStream("chirp_regular_400_with_fluent.otf")?.let { inputStream ->
            Files.write(Paths.get(fontDirectory.path, "chirp_regular_400.otf"), inputStream.readAllBytes())
        } ?: throw PatchException("The res/font/ロゴたいぷゴシック.otf file can not be found. in ${classLoader.getResource("")}")


    }
}
