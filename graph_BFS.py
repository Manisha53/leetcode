# In BFS graph traversal approach, queue data structure is used. The element is pushed from the rear end and is removed from the front end. Each time the element is removed from the queue, its neighbours are pushed into the queue from the rear end. And the process repeates.


graph = {
	"a": ["b","d"],
    "b": [],
    "c": [],
  	"d": ["e","g"],
  	"e": ["c"],
  	"f": [],
  	"g": ["f"]
  }
def bfs (graph, source):
  queue = []
  queue.append(source)
  while queue:
    node = queue.pop(0) #pop from front
    print(node)
    for neighbour in graph[node]:
      queue.append(neighbour)
      
bfs(graph, "a")

output -
a
b
d
e
g
c
f
