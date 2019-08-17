# Brittni Watkins
# 37996950
# 10 February 2019
# CSE 8935
# Assignment 3
# GISMO and Search
# Python Server

import socket

HOST = 'localhost'
PORT = 8088

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind((HOST, PORT))

print('Server waiting for client')

server.listen(2)
(connection, address) = server.accept()

print('Client accepted from: ', address)

message = connection.recv(1024)

print('Message received: ', message.decode())

response = 'Echo back to you from Python: ' + message.decode()
connection.sendall(response.encode())
connection.close()
