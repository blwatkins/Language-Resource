# Brittni Watkins
# 37996950
# 10 February 2019
# CSE 8935
# Assignment 3
# GISMO and Search
# Python Client

import socket

HOST = 'localhost'
PORT = 8088

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect((HOST, PORT))
message = "Hello there from Python"
messageBytes = message.encode('utf-8')
client.sendall(messageBytes)
response = client.recv(1024)
client.close()

print('Data from server: %s' %response.decode())
