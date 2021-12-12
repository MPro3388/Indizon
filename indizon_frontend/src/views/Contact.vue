<template>
  <div class="home">
    <img class="img" alt="Blue Shield logo" src="../assets/BlueShield.png">
    <HelloWorld msg="Contact Formular"/>

    <form id="contact">
      <label id="h2" form="contact">Kontaktformular</label>
      <fieldset>
        <legend>Name</legend>

        <label for="vorname">
          Vorname: <input name="vorname" id="vorname" placeholder="Max">
        </label>

        <label for="nachname">
          Nachname: <input name="nachname" id="nachname" placeholder="Mustermann">
        </label>

      </fieldset>

      <fieldset>
        <legend>Geburtsdatum</legend>

        <label for="birth">
           <input name="birth" id="birth" placeholder="TT.MM.JJJJ">
        </label>

      </fieldset>

      <fieldset>
        <legend>Geschlecht</legend>

        <label for="männl">
          <input type="radio" name="geschlecht" id="männl" value="männl">
          männlich
        </label>

        <label for="weibl">
          <input type="radio" name="geschlecht" id="weibl" value="weibl">
          weiblich
        </label>

      </fieldset>

      <fieldset>
        <legend>Anliegen</legend>

       <h1>Anliegen</h1>
        <p>Schreiben Sie ihr Anliegen:</p>
        <textarea cols="50" rows="10"></textarea>

      </fieldset>

      <button type="reset">Eingaben zurücksetzen</button>
      <button type="submit">Eingaben absenden</button>
    </form>

  </div>
</template>

<style>
.img{
  width: 350px;
  height: 300px
}

#contact{
  text-align: center;
  width: 50%;
  height: 100%;
  margin-left: auto;
  margin-right: auto;
  border: 0;
  cellpadding:0;
  cellspacing: 0;
}

#h2{
  font-size: 40px;
  font-style: inherit;
  font-palette: dark;
}
</style>
