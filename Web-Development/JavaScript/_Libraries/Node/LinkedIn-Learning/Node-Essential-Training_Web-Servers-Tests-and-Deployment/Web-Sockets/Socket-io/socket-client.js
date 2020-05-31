const socketIO = require('socket.io-client');

const socket = socketIO('http://localhost:8000')

socket.on('connect', () => {
    console.log('socket.io client connected');
});

socket.on('chat-message', (message, id) => {
    console.log(`${id}: ${message}`);
});

process.stdin.on('data', (data) => {
    socket.emit('chat', data.toString().trim());
});
