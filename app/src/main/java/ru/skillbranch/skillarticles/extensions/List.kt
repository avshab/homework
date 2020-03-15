package ru.skillbranch.skillarticles.extensions

fun List<Pair<Int, Int>>.groupByBounds(bounds: List<Pair<Int, Int>>): List<MutableList<Pair<Int, Int>>> = bounds.map{ bound ->
    val stepList = mutableListOf<Pair<Int, Int>>()
    forEach { searchPair ->
        if(searchPair.first in bound.first..bound.second || searchPair.second in bound.first..bound.second) {
            val x1 = if(searchPair.first > bound.first) searchPair.first else bound.first
            val x2 = if(searchPair.second < bound.second) searchPair.second else bound.second
            if(!x1.equals(x2)) stepList.add(Pair(x1,x2))
        }
    }
    stepList
}