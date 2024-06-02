# DFS can be implemented using stack data structure. Push the source into the stack. Then pop the topmost element from stack and print it. Push the neighbours of the popped element back into the stack and repeate the process.

graph = {
	"a": ["b","d"],
    "b": [],
    "c": [],
  	"d": ["e","g"],
  	"e": ["c"],
  	"f": [],
  	"g": ["f"]
  }
def dfs (graph, source):
  stack = []
  stack.append(source)
  while stack:
    node = stack.pop(-1)
    print(node)
    for neighbour in graph[node]:
      stack.append(neighbour)
      
dfs(graph, "a")

output:
a
d
g
f
e
c
b
