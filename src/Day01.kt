fun main() {
    fun part1(input: List<String>): Int {
        var prev = 0
        var count = 0
        for (i in 1 until input.size) {
            println(i)
            if (input[i] > input[prev]) {
                count += 1
            }
            prev += 1
        }
        return count
    }

    fun part2(input: List<String>): Int {
        println("Normal commit to check")
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part2(testInput) == 8)
    println(part1(testInput))
    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
