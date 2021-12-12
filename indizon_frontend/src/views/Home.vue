<template>
  <div class="home">
    <img class="img" alt="Indizon logo" src="../assets/BlueShield.png">
    <HelloWorld msg="Welcom to Indizon Shop"/>
    <table class="Tabelle">
      <tr>
        <th>Product</th>
        <th>Preis</th>
      </tr>
      <tr>
        <td>
          Haarcreme
        </td>

        <td>2,99</td>

      </tr>
      <tr>
        <td>
          USB-Stick 32 GB
        </td>
        <td>14,99</td>
      </tr>
      <tr>
        <td>
          Hugo Boxershorts 3erPack
        </td>
        <td>19,99</td>
      </tr>
    </table>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'Home',
  components: {
    HelloWorld
  }
}
</script>
<style>
.img{
  width: 350px;
  height: 300px
}

.Tabelle{
  text-align: center;
  width: 30%;
  height: 100%;
  margin-left: auto;
  margin-right: auto;
  border: 0;
  cellpadding:0;
  cellspacing: 0;
}
</style>
