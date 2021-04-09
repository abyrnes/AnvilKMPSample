package com.abyrnesdev.anvilkmpsample

import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject

interface JvmDependency

@ContributesBinding(ApplicationScope::class)
class JvmDependencyImpl @Inject constructor() : JvmDependency
