// Encontre a substring palíndroma mais longa na string abaixo:
// "babad"

export function ex03(text) {
	let stringSize = text.length;
	let result = "";

	for (let i = 0; i < stringSize; i++) {
		for (let j = i + 1; j <= stringSize; j++) {
			let substring = text.substring(i, j);
			if (isPalindrome(substring) && substring.length > result.length) {
				result = substring;
			}
		}
	}

	return result;
}

function isPalindrome(text) {
	let start = 0;
	let end = text.length - 1;

	while (start < end) {
		if (text.charAt(start) != text.charAt(end)) {
			return false;
		}
		start++;
		end--;
	}

	return true;
}
