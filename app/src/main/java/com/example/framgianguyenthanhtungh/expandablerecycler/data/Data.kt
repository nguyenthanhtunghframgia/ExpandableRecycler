package com.example.framgianguyenthanhtungh.expandablerecycler.data

import com.example.framgianguyenthanhtungh.expandablerecycler.model.Child
import com.example.framgianguyenthanhtungh.expandablerecycler.model.Parent

fun createChildItem1(): List<Child> {
    return listOf(
        Child("1", 1),
        Child("1", 2),
        Child("1", 3),
        Child("1", 4),
        Child("1", 5)
    )
}

fun createChildItem2(): List<Child> {
    return listOf(
        Child("2", 1),
        Child("2", 2),
        Child("2", 3),
        Child("2", 4),
        Child("2", 5)
    )
}

fun createChildItem3(): List<Child> {
    return listOf(
        Child("3", 1),
        Child("3", 2),
        Child("3", 3),
        Child("3", 4),
        Child("3", 5)
    )
}

fun createChildItem4(): List<Child> {
    return listOf(
        Child("4", 1),
        Child("4", 2),
        Child("4", 3),
        Child("4", 4),
        Child("4", 5)
    )
}

fun createParent(): List<Parent> {
    return listOf(
        Parent(
            "1",
            createChildItem1()
        ),
        Parent(
            "2",
            createChildItem2()
        ),
        Parent(
            "3",
            createChildItem3()
        ),
        Parent(
            "4",
            createChildItem4()
        )
    )
}
