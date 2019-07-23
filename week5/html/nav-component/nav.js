const nav = document.getElementById('app-nav');
nav.classList = 'navbar navbar-expand-md navbar-dark bg-dark';
nav.innerHTML = `
<a class="navbar-brand" href="#">Expand at md</a>
<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample04"
    aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
</button>

<div class="collapse navbar-collapse" id="navbarsExample04">
    <ul class="navbar-nav mr-auto">
        <li class="nav-item ">
            <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item ">
            <a class="nav-link" href="#">View Cards<span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item active">
            <a class="nav-link" href="/cards-table.html">View Cards Table<span
                    class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item ">
            <a class="nav-link" href="#">View Users<span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/chuck-norris/chuck-norris.html">Chuck Norris<span
                    class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/pokemon/pokemon.html">Pokemon<span
                    class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="dropdown04" data-toggle="dropdown"
                aria-haspopup="true" aria-expanded="false">Dropdown</a>
            <div class="dropdown-menu" aria-labelledby="dropdown04">
                <a class="dropdown-item" href="#">Action</a>
                <a class="dropdown-item" href="#">Another action</a>
                <a class="dropdown-item" href="#">Something else here</a>
            </div>
        </li>
    </ul>
    <ul class="navbar-nav">
    <li class="nav-item">
            <a class="nav-link" href="/login.html">Sign In<span
                    class="sr-only">(current)</span></a>
        </li>
    </ul>
    <div id="nav-username" class="my-2 my-md-0"></div>
</div>
`;

const user = JSON.parse(localStorage.getItem('user'));
if (user) {
    document.getElementById('nav-username').innerText = user.username;
}
