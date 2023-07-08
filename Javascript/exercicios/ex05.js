// Verifique se a string é um anagrama de um palíndromo
// Exemplo: "racecar" -> true

// Lógica -> verificar se a string é um palíndromo
// quantas vezes uma letra é escrita
// se impar <= 1, pode ser um palíndromo
// se impar > 1, não pode ser um palíndromo

export function ex05(text) {
	let result;
	let letters = text.split("");
	let odd = 0; // ímpar

	letters.forEach((letter) => {
		let tempTimes = 0;

		letters.forEach((letter2) => {
			if (letter == letter2) {
				tempTimes++;
			}
		});

		if (tempTimes % 2 !== 0) {
			odd++;
		}
	});

	// se tiver mais de uma letra ímpar, não é possível que seja um palíndromo
	odd > 1 ? (result = false) : (result = true);

	return result;
}
