/**
 * Minimum Moves to Reach Target Score
 *
 * You are playing a game with integers. You start with the integer 1 and you want to reach the integer target.
 *
 * In one move, you can either:
 *
 * Increment the current integer by one (i.e., x = x + 1).
 * Double the current integer (i.e., x = 2 * x).
 * You can use the increment operation any number of times, however, you can only use the double operation at most maxDoubles times.
 *
 * Given the two integers target and maxDoubles, return the minimum number of moves needed to reach target starting with 1.
 *
 * @param {number} target
 * @param {number} maxDoubles
 * @return {number}
 *
 * O(n) time complexity
 */
const minMoves = (target, maxDoubles) => {
	let increments = 0, doubles = 0;
	while (target > 0 && doubles < maxDoubles) {
		if (target % 2 === 1) {
			increments++;
			target = target - 1;
		} else {
			doubles++;
			target = target/2;
		}
	}

	return increments + doubles + (target - 1);
};

export default minMoves;