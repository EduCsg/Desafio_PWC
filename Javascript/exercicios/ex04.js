// Coloque em maiúscula a primeira letra de cada frase na string:
// hello, how are you? i'm fine, thank you.

export function ex04(text) {
	let textArr = text.split(" ");
	let result = "";

	textArr.forEach((word) => {
		result += word.charAt(0).toUpperCase() + word.slice(1) + " ";
	});

	return result;
}
