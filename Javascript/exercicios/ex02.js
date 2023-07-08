// Remova todos os caracteres duplicados da string abaixo:
// "Hello, World!"

export function ex02(text) {
	let letters = text.split("");
	let repeatedLetters = [];
	let result = "";

	for (let i = 0; i < letters.length; i++) {
		if (!repeatedLetters.includes(letters[i])) {
			result += letters[i];
			repeatedLetters.push(letters[i]);
		}
	}

	return result;
}
