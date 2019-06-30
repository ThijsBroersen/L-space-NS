package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Recipe extends OntologyDef(
        iri = "http://schema.org/Recipe",
        iris = Set("http://schema.org/Recipe"),
        label = "Recipe",
        comment = """A recipe. For dietary restrictions covered by the recipe, a few common restrictions are enumerated via <a class="localLink" href="http://schema.org/suitableForDiet">suitableForDiet</a>. The <a class="localLink" href="http://schema.org/keywords">keywords</a> property can also be used to add more detail.""",
        `@extends` = () => List(HowTo.ontology)
       ){
}