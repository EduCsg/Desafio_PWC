// Reverta a ordem das palavras nas frases, mantendo a ordem das palavras:
// "Hello, World! OpenAI is amazing."
export function ex01(text) {
	let result = text.split(" ").reverse().join(" ");

	return result;
}
