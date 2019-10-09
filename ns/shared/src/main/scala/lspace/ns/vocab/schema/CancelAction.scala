package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CancelAction extends OntologyDef(
        iri = "http://schema.org/CancelAction",
        iris = Set("http://schema.org/CancelAction"),
        label = "CancelAction",
        comment = """The act of asserting that a future event/action is no longer going to happen.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/ConfirmAction">ConfirmAction</a>: The antonym of CancelAction.</li>
</ul>
""",
        `@extends` = List(PlanAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.PlanAction.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.PlanAction.Properties{

}
}