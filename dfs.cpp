#include<iostream>
#include<map>
#include<list>
using namespace std;
template<typename t>
class graph
{
	map<t,list <t>>l;
	public:
		void edge(int x,int y)
		{
			l[x].push_back(y);
			l[y].push_back(x);
		}
		void dfs_helper(t src,map<t,bool>&visited)
		{
			cout<<src<<" ";
			visited[src]=true;
			for(t nbr:l[src])
			{
				if(!visited[nbr])
				{
					dfs_helper(nbr,visited);
				}
			}
		}
		void dfs(t src)
		{
			map<t,bool>visited;
			for(auto p:l)
			{
				t node=p.first;
				visited[node]=false;
				
			}
			dfs_helper(src,visited);
		}
	
};




int main()
{
	graph<int>g;
	g.edge(0,1);
	g.edge(1,2);
	g.edge(2,3);
	g.edge(3,4);
	g.edge(4,5);
	g.edge(3,0);
	g.dfs(0);
}
