package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object EmployerReview extends OntologyDef(
        iri = "http://schema.org/EmployerReview",
        iris = Set("http://schema.org/EmployerReview"),
        label = "EmployerReview",
        comment = """An <a class="localLink" href="http://schema.org/EmployerReview">EmployerReview</a> is a review of an <a class="localLink" href="http://schema.org/Organization">Organization</a> regarding its role as an employer, written by a current or former employee of that organization.""",
        `@extends` = () => List(Review.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Review.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Review.Properties{

}
}