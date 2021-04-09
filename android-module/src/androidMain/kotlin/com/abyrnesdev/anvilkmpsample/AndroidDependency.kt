package com.abyrnesdev.anvilkmpsample

import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject

interface AndroidDependency

@ContributesBinding(ApplicationScope::class)
class AndroidDependencyImpl @Inject constructor() : AndroidDependency
