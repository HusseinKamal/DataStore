package com.hussein.datastore

import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf
import kotlinx.serialization.Serializable

@Serializable
data class AppSettings(
    val language: Language = Language.ARABIC,
    val knowLocations : PersistentList<Location> = persistentListOf()
)

@Serializable
data class Location(
    val lat: Double,
    val lng : Double
)

enum class Language {
    ARABIC , ENGLISH , GERMAN
}
