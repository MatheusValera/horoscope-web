function GeraHor(value)
{
    event.preventDefault();    
   
    var httpRequest = new XMLHttpRequest();
    httpRequest.open("post","MensagemHoro");
    var formData = new FormData(value);
    const data = new URLSearchParams();

    for (const pair of formData)
        data.append(pair[0], pair[1]);
    
    httpRequest.send(data);
    
    httpRequest.onreadystatechange = function () 
    {
        if (httpRequest.readyState === 4 && httpRequest.status === 200)  
        {
            vet = httpRequest.responseText.split(";");
            document.getElementById("imagem").src=innerHTML=vet[1];
            document.getElementById("signo").innerHTML=vet[0];
            document.getElementById("mensagem").innerHTML=vet[2];
        }
    };
}
