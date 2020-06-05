const endpoint = 'http://localhost:8088/message'
export const load = async () => {
  const response = await fetch(endpoint, {
    method: 'GET',
    cache: "no-cache",
  });
  console.log('blah')
  return response.json();
};

export const loadCached = async () => {
  const response = await fetch(endpoint, {
    method: 'GET',
  });
  console.log('bleh')
  return response.json();
};
