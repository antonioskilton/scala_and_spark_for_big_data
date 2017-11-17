 val mymap = Map(("a", 1),("b",2),("c",3))
//like indexing in list but passing in key instead of ind
mymap("a")
mymap("c")
mymap("d")

mymap get "a"
//following shows difference between () and get
mymap get "d"
mymap get "D"

//mutable maps so we can add key:value pairs
val mymutmap = collection.mutable.Map(("x",1),("y",2),("z",3))
mymutmap += ("newkey" -> 999)
mymutmap
mymutmap += ("brandnew", 12) // must use arrow

//methods

mymap

mymap.keys

mymap.values
