/*
 * Copyright 2024 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package dev.icerock.gradle.actions.apple

import org.gradle.api.Task
import org.jetbrains.kotlin.gradle.plugin.mpp.AbstractExecutable
import org.jetbrains.kotlin.gradle.tasks.KotlinNativeLink

internal class CopyResourcesFromKLibsToExecutableAction : CopyResourcesFromKLibsAction() {
    override fun execute(task: Task) {
        task as KotlinNativeLink

        copyResourcesFromLibraries(
            linkTask = task,
            outputDir = task.outputFile.get()
        )
    }
}
