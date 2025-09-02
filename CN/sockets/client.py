import socket

sock=socket.socket(socket.AF_INET, socket.SOCK_STREAM)

sock.connect(('localhost', 12345))
print("Connected to server")
data=sock.recv(1024)
print(f"Received from server: {data.decode('utf-8')}")
while True:
    inp=input("Press Enter to send a message to the server...")
    sock.send(bytes(inp, "utf-8"))