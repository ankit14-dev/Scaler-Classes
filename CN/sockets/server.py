import socket

sock=socket.socket(socket.AF_INET, socket.SOCK_STREAM)
print("Socket created")

interface = 'localhost'
port = 12345
sock.bind((interface, port))
print(f"Socket binded to {port}")

sock.listen()
print("Socket is listening")


conn, addr = sock.accept()
print(f"Connection from {addr} has been established!")
conn.send(bytes("Welcome to the server!", "utf-8"))
while True:
    data=conn.recv(1024)
    if data== "stop":
        break
    print(f"Received data: {data.decode('utf-8')}")
    
conn.close()
sock.close()