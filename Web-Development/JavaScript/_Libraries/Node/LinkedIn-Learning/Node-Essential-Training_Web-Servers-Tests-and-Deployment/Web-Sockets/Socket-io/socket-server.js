const http = require('http');
const socketIO = require('socket.io');

const server = http.createServer().listen(8000);
const io = socketIO(server);

io.on('connection', (socket) => {
    console.log(`${io.engine.clientsCount} connections`);
    console.log(`${socket.id} connected`);

    socket.on('chat', (message) => {
        console.log(`${socket.id}: ${message}`);
        io.sockets.emit('chat-message', message, socket.id);
    });

    socket.on('disconnect', () => {
        console.log(`${socket.id} disconnected`);
    });
});

console.log('Socket Server');
