const tableContainer = document.getElementById('card-table-container');
const tableBody = tableContainer.childNodes[1].childNodes[3];
tableBody.innerHTML += `
    <tr>
        <td>Debit Card</td>
        <td>Life</td>
        <td>Okay</td>
        <td>-300</td>
        <td>Matt</td>
    </tr>
`;