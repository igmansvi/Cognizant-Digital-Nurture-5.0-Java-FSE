import React, { Component } from 'react';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      error: null
    };
  }

  loadPosts = () => {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => {
        this.setState({ posts: data });
      })
      .catch(error => {
        this.setState({ error });
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert("An error occurred: " + error.message);
  }

  render() {
    if (this.state.error) {
      return <div>Error loading posts.</div>;
    }

    return (
      <div style={{ padding: '20px' }}>
        <h1 style={{ textAlign: 'center', color: '#333' }}>Blog Posts</h1>
        {this.state.posts.map(post => (
          <div key={post.id} style={{ borderBottom: '1px solid #ccc', paddingBottom: '10px', marginBottom: '10px' }}>
            <h3 style={{ color: '#0056b3' }}>{post.title}</h3>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
