`use strict`

import * as DOM from './dom.js';

// list item function
const writeItem = item => {
  const child = document.createElement(`li`);
  child.id = item._id;
  child.innerHTML = `${JSON.stringify(item)}`;
  DOM.listOutput.appendChild(child);
}

// GET all function
const get = () => {
  DOM.listOutput.innerHTML = ``;

  axios.get(`/read`)
    .then((response) => {
      if (!Array.isArray(response.data)) {
        writeItem(response.data);
      } else {
        for (let item of response.data) {
          writeItem(item);
        }
      }
    }).catch((err) => {
      console.log(err);
    });
}

// POST function
const post = () => {
  axios.post(`/create`, {name : DOM.inputName.value})
    .then((response) => {
      console.log(response);
      get();
    }).catch((err) => {
      console.log(err);
    });
}

DOM.buttonCreate.onclick = () => post();

/*

EXPRESS CHALLENGE

*/

// in script.js add a function to read just one item from the database (you will need to pass in an ID)

const getOne = () => {
  axios.get(`/read/${DOM.inputID.value.toString()}`)
    .then((response) => {
      DOM.singleOutput.innerHTML = JSON.stringify(response.data)
    }).catch((err) => {
      console.log(err);
    });
}

DOM.buttonReadOne.onclick = () => getOne();


/*

BONUS

*/

const put = () => { 
  axios.put(`/update/${DOM.inputID.value.toString()}`, {name:DOM.inputUpdateName.value,_id:DOM.inputUpdateID.value.toString()})
    .then((response) => {
     console.log(response);
     get();
    }).catch((err) => {
      console.log(err);
    });
}

DOM.editBtn.onclick = () => put();

const del = () => { 
  axios.delete(`/delete/${DOM.inputID.value.toString()}`)
    .then((response) => {
     console.log(response);
     get();
    }).catch((err) => {
      console.log(err);
    });
}

DOM.buttonDelete.onclick = () => del();
