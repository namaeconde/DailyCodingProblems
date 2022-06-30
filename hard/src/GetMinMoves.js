/**
 * [2, 4, 3, 1, 6]
 * return 3
 */

const getMinMoves = (array) => {
	let minIndex = 0;
	let min = array[0];
	for (const num of array) {
		if (num < min) {
			min = num;
			minIndex = array.indexOf(num);
		}
	}

	return minIndex;
}
