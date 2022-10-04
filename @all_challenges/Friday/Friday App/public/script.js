`use strict`

// import the dom
import * as DOM from './dom.js';

// list item function
const writeItem = item => {
    const child = document.createElement(`li`);
    child.id = item._id;
    child.innerHTML = `${
        JSON.stringify(item)
    }`;
    DOM.listOutput.appendChild(child);
}

// GET all function
const get = () => {
    DOM.listOutput.innerHTML = ``;

    axios.get(`/read`).then((response) => {
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

// GET one function
const getOne = () => {
    axios.get(`/read/${
        DOM.getOneIn.value.toString()
    }`).then((response) => {
        DOM.getOneOut.innerHTML = JSON.stringify(response.data);
    }).catch((err) => {
        console.log(err);
    });
}

DOM.getOneBtn.onclick = () => getOne();

// POST function
const post = () => {
    axios.post(`/create`, {
        name: DOM.inputName.value,
        description: DOM.inputDescription.value,
        cost: DOM.inputPrice.value
    }).then((response) => {
        console.log(response);
        get();
    }).catch((err) => {
        console.log(err);
    });
}

// set up the buttons' on click events
DOM.buttonCreate.onclick = () => post();

// PUT function
const put = () => {
    axios.put(`/update/${
        DOM.editID.value
    }`, {
        _id: DOM.editID.value,
        name: DOM.editName.value,
        description: DOM.editDescription.value,
        cost: DOM.editPrice.value
    }).then((response) => {
        console.log(response);
        get();
    }).catch((err) => {
        console.log(err);
    });
}

DOM.editBtn.onclick = () => put();

// DELETE
const remove = () => {
    axios.delete(`/delete/${DOM.delID.value.toString()}`)
    .then((response) => {
      console.log(response);
        get();
    }).catch((err) => {
        console.log(err);
    });
}

DOM.delBtn.onclick = () => remove();

// run the get function on page load
get();
