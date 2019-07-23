
document.getElementById('one')
    .addEventListener('click', (event) => {
        console.log('event occured on element: one')
    }, false) // setting the third parameter to true will enable capturing

document.getElementById('two')
    .addEventListener('click', (event) => {
        console.log('event occured on element: two')
    }, false)


document.getElementById('three')
    .addEventListener('click', (event) => {
        event.stopPropagation(); // prevent further propogation from happening
        console.log('event occured on element: three')
    }, false)


document.getElementById('four')
    .addEventListener('click', (event) => {
        console.log('event occured on element: four')
    }, false)