import { useForm } from '@vaadin/hilla-react-form';
import PersonModel from "Frontend/generated/com/example/PersonModel";
import {PersonEndpoint} from "Frontend/generated/endpoints";
import {Button, TextField} from "@vaadin/react-components";
import {useEffect} from "react";

export default function PersonView() {

    useEffect(() => {
        PersonEndpoint.getPerson();
    })
    const { model, submit, field } = useForm(PersonModel, {
        onSubmit: async (person) => {
            await PersonEndpoint.savePerson(person);
        }
    });

    return (
        <section>
            <TextField label="Full name" {...field(model.fullName)}></TextField>
            <Button onClick={submit}>Save</Button>
        </section>
    );

}