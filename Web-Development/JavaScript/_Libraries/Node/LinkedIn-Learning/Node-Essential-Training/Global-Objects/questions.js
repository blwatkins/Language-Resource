process.stdout.write("Hello, World!\n"); // outputs to console

let questions = [
    'What is your name?',
    'What is your age?',
    'What is your favorite programming language?'
];

let answers = [];

function askQuestion(i = 0) {
    process.stdout.write(questions[i]);
    process.stdout.write(' > ');
}

askQuestion();

process.stdin.on('data', (data) => {
    answers.push(data.toString().trim());

    if (answers.length < questions.length) {
        askQuestion(answers.length);
    } else {
        process.exit();
    }
});

process.on('exit', () => {
    let [name, age, language] = answers;
    console.log(`Hello, ${name}! You are ${age} years old. You like to code in ${language}.`);
});
