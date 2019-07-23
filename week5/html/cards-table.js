
function addCardRow(card) {
    if(!card) {
        return;
    }
    const tableContainer = document.getElementById('card-table-container');
    const tableBody = tableContainer.childNodes[1].childNodes[3];
    tableBody.innerHTML += `
        <tr>
            <td>${card.name}</td>
            <td>${card.game && card.game.name}</td>
            <td>${card.quality && card.quality.label}</td>
            <td>${card.value}</td>
            <td>${card.owner ? card.owner.name : '~'}</td>
        </tr>
    `;
}

function safeAddCardRow(card) {
    if(!card) {
        return;
    }
    const tableContainer = document.getElementById('card-table-container');
    const tableBody = tableContainer.childNodes[1].childNodes[3];
    
    const row = document.createElement('tr');
    tableBody.appendChild(row);
    
    const nameData = document.createElement('td');
    nameData.innerText = card.name;
    row.appendChild(nameData);

    const gameData = document.createElement('td');
    gameData.innerText = card.game && card.game.name;
    row.appendChild(gameData);

    const conditionData = document.createElement('td');
    conditionData.innerText = card.quality && card.quality.label;
    row.appendChild(conditionData);

    const valueData = document.createElement('td');
    valueData.innerText = card.value;
    row.appendChild(valueData);

    const ownerData = document.createElement('td');
    ownerData.innerText = card.owner ? card.owner.name : '~';
    row.appendChild(ownerData);

}


function updateCondition(event) {
    console.log(event);
    const dropdown = document.getElementById('condition-dropdown');
    dropdown.innerText = event.target.innerText;
}

function updateGameDropdown(event) {
    console.log(event);
    const dropdown = document.getElementById('game-dropdown');
    dropdown.innerText = event.target.innerText;
}

function submitNewCard(event) {
    event.preventDefault(); // prevent the default functionality causing the page to refresh
    console.log('adding new card from form data');
    const cardName = document.getElementById('card-name-input').value;
    const cardValue = document.getElementById('card-value-input').value;
    const gameName = document.getElementById('game-dropdown').innerText;
    const conditionName = document.getElementById('condition-dropdown').innerText;
    const card = {
        name: cardName,
        value: cardValue,
        game: {
            name: gameName
        },
        quality: {
            label: conditionName
        }
    };
    addCardRow(card); 
}

function safeSubmitNewCard(event) {
    event.preventDefault(); // prevent the default functionality causing the page to refresh
    console.log('adding new card from form data');
    const cardName = document.getElementById('card-name-input').value;
    const cardValue = document.getElementById('card-value-input').value;
    const gameName = document.getElementById('game-dropdown').innerText;
    const conditionName = document.getElementById('condition-dropdown').innerText;
    const card = {
        name: cardName,
        value: cardValue,
        game: {
            name: gameName
        },
        quality: {
            label: conditionName
        }
    };
    safeAddCardRow(card); 
}


addCardRow({
    name: 'Debit Card',
    game: {
        name: 'Life'
    },
    quality: {
        label: 'Okay'
    },
    value: -300,
    owner: {
        name: 'Matt'
    }
});