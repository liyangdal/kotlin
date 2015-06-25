package kotlin

//
// NOTE THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import kotlin.platform.*
import java.util.*

import java.util.Collections // TODO: it's temporary while we have java.util.Collections in js

/**
 * Returns an average value of elements in the collection.
 */
platformName("averageOfInt")
public fun Iterable<Int>.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns an average value of elements in the collection.
 */
platformName("averageOfInt")
public fun Sequence<Int>.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns an average value of elements in the collection.
 */
platformName("averageOfInt")
public fun Array<out Int>.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns an average value of elements in the collection.
 */
public fun IntArray.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns an average value of elements in the collection.
 */
platformName("averageOfLong")
public fun Iterable<Long>.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns an average value of elements in the collection.
 */
platformName("averageOfLong")
public fun Sequence<Long>.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns an average value of elements in the collection.
 */
platformName("averageOfLong")
public fun Array<out Long>.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns an average value of elements in the collection.
 */
public fun LongArray.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns an average value of elements in the collection.
 */
platformName("averageOfByte")
public fun Iterable<Byte>.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns an average value of elements in the collection.
 */
platformName("averageOfByte")
public fun Sequence<Byte>.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns an average value of elements in the collection.
 */
platformName("averageOfByte")
public fun Array<out Byte>.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns an average value of elements in the collection.
 */
public fun ByteArray.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns an average value of elements in the collection.
 */
platformName("averageOfShort")
public fun Iterable<Short>.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns an average value of elements in the collection.
 */
platformName("averageOfShort")
public fun Sequence<Short>.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns an average value of elements in the collection.
 */
platformName("averageOfShort")
public fun Array<out Short>.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns an average value of elements in the collection.
 */
public fun ShortArray.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns an average value of elements in the collection.
 */
platformName("averageOfDouble")
public fun Iterable<Double>.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns an average value of elements in the collection.
 */
platformName("averageOfDouble")
public fun Sequence<Double>.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns an average value of elements in the collection.
 */
platformName("averageOfDouble")
public fun Array<out Double>.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns an average value of elements in the collection.
 */
public fun DoubleArray.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns an average value of elements in the collection.
 */
platformName("averageOfFloat")
public fun Iterable<Float>.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns an average value of elements in the collection.
 */
platformName("averageOfFloat")
public fun Sequence<Float>.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns an average value of elements in the collection.
 */
platformName("averageOfFloat")
public fun Array<out Float>.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns an average value of elements in the collection.
 */
public fun FloatArray.average(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    var count: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
        count += 1
    }
    return if (count == 0) 0.0 else sum / count
}

/**
 * Returns the sum of all elements in the collection.
 */
platformName("sumOfInt")
public fun Iterable<Int>.sum(): Int {
    val iterator = iterator()
    var sum: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection.
 */
platformName("sumOfInt")
public fun Sequence<Int>.sum(): Int {
    val iterator = iterator()
    var sum: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection.
 */
platformName("sumOfInt")
public fun Array<out Int>.sum(): Int {
    val iterator = iterator()
    var sum: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection.
 */
public fun IntArray.sum(): Int {
    val iterator = iterator()
    var sum: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection.
 */
platformName("sumOfLong")
public fun Iterable<Long>.sum(): Long {
    val iterator = iterator()
    var sum: Long = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection.
 */
platformName("sumOfLong")
public fun Sequence<Long>.sum(): Long {
    val iterator = iterator()
    var sum: Long = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection.
 */
platformName("sumOfLong")
public fun Array<out Long>.sum(): Long {
    val iterator = iterator()
    var sum: Long = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection.
 */
public fun LongArray.sum(): Long {
    val iterator = iterator()
    var sum: Long = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection.
 */
platformName("sumOfByte")
public fun Iterable<Byte>.sum(): Int {
    val iterator = iterator()
    var sum: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection.
 */
platformName("sumOfByte")
public fun Sequence<Byte>.sum(): Int {
    val iterator = iterator()
    var sum: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection.
 */
platformName("sumOfByte")
public fun Array<out Byte>.sum(): Int {
    val iterator = iterator()
    var sum: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection.
 */
public fun ByteArray.sum(): Int {
    val iterator = iterator()
    var sum: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection.
 */
platformName("sumOfShort")
public fun Iterable<Short>.sum(): Int {
    val iterator = iterator()
    var sum: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection.
 */
platformName("sumOfShort")
public fun Sequence<Short>.sum(): Int {
    val iterator = iterator()
    var sum: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection.
 */
platformName("sumOfShort")
public fun Array<out Short>.sum(): Int {
    val iterator = iterator()
    var sum: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection.
 */
public fun ShortArray.sum(): Int {
    val iterator = iterator()
    var sum: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection.
 */
platformName("sumOfDouble")
public fun Iterable<Double>.sum(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection.
 */
platformName("sumOfDouble")
public fun Sequence<Double>.sum(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection.
 */
platformName("sumOfDouble")
public fun Array<out Double>.sum(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection.
 */
public fun DoubleArray.sum(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection.
 */
platformName("sumOfFloat")
public fun Iterable<Float>.sum(): Float {
    val iterator = iterator()
    var sum: Float = 0.0f
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection.
 */
platformName("sumOfFloat")
public fun Sequence<Float>.sum(): Float {
    val iterator = iterator()
    var sum: Float = 0.0f
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection.
 */
platformName("sumOfFloat")
public fun Array<out Float>.sum(): Float {
    val iterator = iterator()
    var sum: Float = 0.0f
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection.
 */
public fun FloatArray.sum(): Float {
    val iterator = iterator()
    var sum: Float = 0.0f
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

